import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private _router: Router) { }

  ngOnInit(): void {
  }
  navigateToPlanningPoker() {
    this._router.navigate(['poker']);
  }

  navigateToReterospective() {
    this._router.navigate(['retero']);
  }

}
