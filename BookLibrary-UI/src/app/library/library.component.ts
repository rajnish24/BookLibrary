import { Component, OnInit } from '@angular/core';
import { LibraryService } from '../services/library.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-library',
  templateUrl: './library.component.html',
  styleUrls: ['./library.component.css'],
})
export class LibraryComponent implements OnInit {
  libraryList: any;
  constructor(private libraryService: LibraryService, private router: Router) {}

  ngOnInit(): void {
    this.libraryService.getLibraryList().subscribe((response) => {
      this.libraryList = response;
      console.log(JSON.stringify(response));
    });
  }
  getBookList(data: any): void {
    window.localStorage.setItem('bookList', JSON.stringify(data.books));
    this.router.navigate(['/bookList', data.id]);
  }
}
