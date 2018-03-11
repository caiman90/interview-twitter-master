import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

const  AUTH_ENDPOINT = '/api/auth';

@Injectable()
export class RegisterService {

  constructor(private http: HttpClient) {
  }
  register(user) {
    return this.http.post<any>(AUTH_ENDPOINT + '/register', user);
  }
}
