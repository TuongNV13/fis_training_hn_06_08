package fis.java.training.model;

import fis.java.training.model.enums.CaseStatus;
import fis.java.training.model.enums.CaseType;

import java.time.LocalDateTime;
import java.util.Set;

public class CriminalCase extends AbstractEntity {
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private String number;
    private CaseType type;
    private String shortDescription;
    private String detailedDescription;
    private CaseStatus status;
    private String notes;
    private Set<Evidence> evidencesSet;
    private Detective leadInvestigator;
    private Set<Detective> assigned;

    public CriminalCase() {
    }

    public CriminalCase( LocalDateTime createdAt, LocalDateTime modifiedAt, String number, CaseType type, String shortDescription, String detailedDescription, CaseStatus status, String notes, Set<Evidence> evidencesSet,
                        Detective leadInvestigator, Set<Detective> assigned) {

        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.number = number;
        this.type = type;
        this.shortDescription = shortDescription;
        this.detailedDescription = detailedDescription;
        this.status = status;
        this.notes = notes;
        this.evidencesSet = evidencesSet;
        this.leadInvestigator = leadInvestigator;
        this.assigned = assigned;
    }

    public void replaceWith(CriminalCase criminalCase){
        this.notes = criminalCase.getNotes();
        this.status = criminalCase.getStatus();
        //....
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CaseType getType() {
        return type;
    }

    public void setType(CaseType type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    public CaseStatus getStatus() {
        return status;
    }

    public void setStatus(CaseStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Evidence> getEvidencesSet() {
        return evidencesSet;
    }

    public void setEvidencesSet(Set<Evidence> evidencesSet) {
        this.evidencesSet = evidencesSet;
    }

    public Detective getLeadInvestigator() {
        return leadInvestigator;
    }

    public void setLeadInvestigator(Detective leadInvestigator) {
        this.leadInvestigator = leadInvestigator;
    }

    public Set<Detective> getAssigned() {
        return assigned;
    }

    public void setAssigned(Set<Detective> assigned) {
        this.assigned = assigned;
    }


}
