import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './components/home/home.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import {MatInputModule} from '@angular/material/input';
import {MatMenuModule} from '@angular/material/menu';
import { ComputerCaseComponent } from './components/computer-case/computer-case.component';
import { ComputerCasePsuComponent } from './components/computer-case-psu/computer-case-psu.component';
import { DisplayCardComponent } from './components/display-card/display-card.component';
import { DisplayCardGpuComponent } from './components/display-card-gpu/display-card-gpu.component';
import { DisplayCardMemoryComponent } from './components/display-card-memory/display-card-memory.component';
import { HDDComponent } from './components/hdd/hdd.component';
import { MainboardComponent } from './components/mainboard/mainboard.component';
import { MainboardRamComponent } from './components/mainboard-ram/mainboard-ram.component';
import { MonitorComponent } from './components/monitor/monitor.component';
import { MonitorScreenComponent } from './components/monitor-screen/monitor-screen.component';
import { CpuComponent } from './components/cpu/cpu.component';
import { CpuCoreComponent } from './components/cpu-core/cpu-core.component';
import { RamComponent } from './components/ram/ram.component';
import { SSDComponent } from './components/ssd/ssd.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NotFoundComponent,
    ComputerCaseComponent,
    ComputerCasePsuComponent,
    DisplayCardComponent,
    DisplayCardGpuComponent,
    DisplayCardMemoryComponent,
    HDDComponent,
    MainboardComponent,
    MainboardRamComponent,
    MonitorComponent,
    MonitorScreenComponent,
    CpuComponent,
    CpuCoreComponent,
    RamComponent,
    SSDComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatMenuModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
