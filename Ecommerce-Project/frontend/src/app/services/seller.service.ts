import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { SignUp } from '../data-type';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SellerService {

  isSellerLoggedIn = new BehaviorSubject<boolean>(false);

  constructor(private http:HttpClient) { }

  userSignUp(data:SignUp){   
    this.http.post("http://localhost:8080/seller", data,
    {observe:'response'}
    ).subscribe((result)=>{
      this.isSellerLoggedIn.next(true);
      console.log(result);
    });
    return false;
  }
}

// Create Service: ng g service services/seller