import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-must-read',
  templateUrl: './must-read.component.html',
  styleUrls: ['./must-read.component.css']
})
export class MustReadComponent implements OnInit {

  books!: any[];
  constructor() { }

   ngOnInit(): void {
    fetch("http://localhost:8080/books")
    .then((datas) => datas.json())
      .then((response) => {
        console.log(response);
        this.books = response
      });
  }

}
