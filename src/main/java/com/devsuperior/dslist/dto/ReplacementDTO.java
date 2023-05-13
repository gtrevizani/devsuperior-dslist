package com.devsuperior.dslist.dto;

public class ReplacementDTO {
    //Atributos
    private Integer sourceIndex;
    private Integer destinationIndex;

    //Métodos
    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
