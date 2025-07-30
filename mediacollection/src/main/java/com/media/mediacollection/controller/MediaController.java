package com.media.mediacollection.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.media.mediacollection.model.MediaItem;

@RestController
@RequestMapping("/media")
@CrossOrigin(origins = "http://localhost:3000")
public class MediaController {

    private final List<MediaItem> mediaList = new ArrayList<>();
    private Long idCounter = 1L;

    @GetMapping
    public List<MediaItem> getAllMedia() {
        return mediaList;
    }

    @PostMapping
    public MediaItem addMedia(@RequestBody MediaItem item) {
        item.setId(idCounter++);
        mediaList.add(item);
        return item;
    }

    @PutMapping("/{id}")
    public MediaItem updateMedia(@PathVariable Long id, @RequestBody MediaItem updatedItem) {
        for (MediaItem item : mediaList) {
            if (item.getId().equals(id)) {
                item.setTitle(updatedItem.getTitle());
                item.setCreator(updatedItem.getCreator());
                item.setGenre(updatedItem.getGenre());
                item.setReleaseDate(updatedItem.getReleaseDate());
                item.setStatus(updatedItem.getStatus());
                return item;
            }
        }
        throw new NoSuchElementException("Media item not found.");
    }

    @DeleteMapping("/{id}")
    public void deleteMedia(@PathVariable Long id) {
        mediaList.removeIf(item -> item.getId().equals(id));
    }
}
