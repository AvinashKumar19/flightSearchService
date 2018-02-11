package com.coviam.dto;


import java.io.Serializable;

public class BaseResponseDTO<T> implements Serializable{
    private int resCode;
    private String resMessage;
    private String interactionId;
    private String interactionType;
    private T response;

    public BaseResponseDTO() {
    }

    public BaseResponseDTO(int resCode, String resMessage, String interactionId, String interactionType, T response) {
        this.resCode = resCode;
        this.resMessage = resMessage;
        this.interactionId = interactionId;
        this.interactionType = interactionType;
        this.response = response;
    }

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMessage() {
        return resMessage;
    }

    public void setResMessage(String resMessage) {
        this.resMessage = resMessage;
    }

    public String getInteractionId() {
        return interactionId;
    }

    public void setInteractionId(String interactionId) {
        this.interactionId = interactionId;
    }

    public String getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(String interactionType) {
        this.interactionType = interactionType;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "BaseResponseDTO{" +
                "resCode=" + resCode +
                ", resMessage='" + resMessage + '\'' +
                ", interactionId='" + interactionId + '\'' +
                ", interactionType='" + interactionType + '\'' +
                ", response=" + response +
                '}';
    }
}
