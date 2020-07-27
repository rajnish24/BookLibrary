import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css'],
})
export class BookListComponent implements OnInit {
  bookList: any = JSON.parse(window.localStorage.getItem('bookList'));
  constructor() {}

  ngOnInit(): void {
    console.log(this.bookList);
  }
}
