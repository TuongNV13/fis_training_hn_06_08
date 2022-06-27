package com.fis.training.service;

import com.fis.training.model.Detective;
import com.fis.training.model.TrackEntry;
import com.fis.training.model.core.Rank;

import java.util.List;

public interface TrackEntryService {
    TrackEntry findById(Long id);
    void createTrackEntry(TrackEntry trackEntry);
    Detective updateTrackEntry(TrackEntry trackEntry);
    void deleteTrackEntryById(Long trackEntryId);
    List<TrackEntry> findAll();
    Detective findByRank(Rank rank);
}
