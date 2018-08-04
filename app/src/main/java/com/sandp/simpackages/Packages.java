package com.sandp.simpackages;

public class Packages {

    private String Title;
    private String DurationDetails;
    private String VolumeInfo;
    private String PriceDetails;
    private String ActivationDetails;
    private String DeactivationDetails;
    private String RemainingDetails;

    public Packages(String title, String durationDetails, String volumeInfo, String priceDetails, String activationDetails, String deactivationDetails, String remainingDetails) {
        Title = title;
        DurationDetails = durationDetails;
        VolumeInfo = volumeInfo;
        PriceDetails = priceDetails;
        ActivationDetails = activationDetails;
        DeactivationDetails = deactivationDetails;
        RemainingDetails = remainingDetails;
    }

    public String getTitle() {
        return Title;
    }

    public String getDurationDetails() {
        return DurationDetails;
    }

    public String getVolumeInfo() {
        return VolumeInfo;
    }

    public String getPriceDetails() {
        return PriceDetails;
    }

    public String getActivationDetails() {
        return ActivationDetails;
    }

    public String getDeactivationDetails() {
        return DeactivationDetails;
    }

    public String getRemainingDetails() {
        return RemainingDetails;
    }
}