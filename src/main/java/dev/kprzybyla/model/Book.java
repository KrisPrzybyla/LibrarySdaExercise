package dev.kprzybyla.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private long bookId;

    private boolean borrow;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private BookCategory bookCategory;

    @Column(nullable = false, unique = true)
    private String isbn;

    private int pages;

    @Column(name = "release_date")
    private int releaseDate;

    @Column(length = 500)
    private String summary;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable=false)
    private Author author;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", borrow=" + borrow +
                ", bookCategory=" + bookCategory +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                ", releaseDate=" + releaseDate +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author.getFirstName() + " " + author.getLastName() +
                '}';
    }
}
