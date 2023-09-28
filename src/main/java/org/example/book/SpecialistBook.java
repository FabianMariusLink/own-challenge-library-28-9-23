package org.example.book;

import java.util.Objects;

public class SpecialistBook extends Book{
    private String specialistField;
    private String difficultyLevel;

    public SpecialistBook(String title, String author, String isbn, String specialistField, String difficultyLevel) {
        super(title, author, isbn);
        this.specialistField = specialistField;
        this.difficultyLevel = difficultyLevel;
    }

    public String getSpecialistField() {
        return specialistField;
    }

    public void setSpecialistField(String specialistField) {
        this.specialistField = specialistField;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialistBook that = (SpecialistBook) o;
        return Objects.equals(specialistField, that.specialistField) && Objects.equals(difficultyLevel, that.difficultyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialistField, difficultyLevel);
    }

    @Override
    public String toString() {
        return "SpecialistBook{" +
                "title='" + super.getTitle() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", isbn='" + super.getIsbn() + '\'' +
                ", isBorrowed=" + super.getBorrowedStatus() +
                ", specialistField='" + specialistField + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                '}';
    }
}
