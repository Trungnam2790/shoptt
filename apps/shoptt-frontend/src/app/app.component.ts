import { Component, OnInit, inject } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FaIconLibrary, FaConfig, FaIconComponent } from '@fortawesome/angular-fontawesome';
import { fontAwesomeIcons } from './shared/font-awesome-icons';
import { NavbarComponent } from './layout/navbar/navbar.component';

@Component({
  standalone: true,
  imports: [RouterModule, FaIconComponent, NavbarComponent],
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent implements OnInit {
  private faIconLibrary = inject(FaIconLibrary);
  private faConfig = inject(FaConfig);

  ngOnInit(): void {
    this.initFontAwesome();
  }

  private initFontAwesome(): void {
    this.faConfig.defaultPrefix = 'far'; // ✅ đúng chỗ
    this.faIconLibrary.addIcons(...fontAwesomeIcons);
  }
}
