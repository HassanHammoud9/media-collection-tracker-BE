package com.media.mediacollection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MediaItem {
    private Long id;
    private String title;
    private String creator;
    private String genre;
    private String releaseDate;
    private String status; // owned, wishlist, currently using, completed
}
