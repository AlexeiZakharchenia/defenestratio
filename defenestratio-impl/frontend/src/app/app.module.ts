import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {LandingComponent} from './components/landing/landing.component';
import {LeaderboardComponent} from './components/leaderboard/leaderboard.component';
import {NavbarComponent} from './components/navbar/navbar.component';
import {ChallengesComponent} from './components/challenges/challenges.component';
import {LoginComponent} from "./components/login/login.component";
import {AngularTiltModule} from "angular-tilt";
import {SignupComponent} from './components/signup/signup.component';
import {FooterComponent} from './components/footer/footer.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import {JwtInterceptor} from "./services/interceptor.service";
import {UserProfileComponent} from "./components/user-profile/user-profile.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    LoginComponent,
    LeaderboardComponent,
    NavbarComponent,
    ChallengesComponent,
    SignupComponent,
    FooterComponent,
    UserProfileComponent,
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    AngularTiltModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: JwtInterceptor,
      multi: true
    },
    AngularTiltModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
