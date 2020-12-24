import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {NotFoundComponent} from './components/not-found/not-found.component';
import {ComputerCaseComponent} from './components/computer-case/computer-case.component';
import {ComputerCasePsuComponent} from './components/computer-case-psu/computer-case-psu.component';
import {CpuComponent} from './components/cpu/cpu.component';
import {CpuCoreComponent} from './components/cpu-core/cpu-core.component';
import {DisplayCardComponent} from './components/display-card/display-card.component';
import {DisplayCardGpuComponent} from './components/display-card-gpu/display-card-gpu.component';
import {DisplayCardMemoryComponent} from './components/display-card-memory/display-card-memory.component';
import {HDDComponent} from './components/hdd/hdd.component';
import {MainboardComponent} from './components/mainboard/mainboard.component';
import {MainboardRamComponent} from './components/mainboard-ram/mainboard-ram.component';
import {MonitorComponent} from './components/monitor/monitor.component';
import {MonitorScreenComponent} from './components/monitor-screen/monitor-screen.component';
import {RamComponent} from './components/ram/ram.component';
import {SSDComponent} from './components/ssd/ssd.component';

const routes: Routes = [
  {
    path: '', component: HomeComponent
  },
  {
    path: 'computercase', component: ComputerCaseComponent
  },
  {
    path: 'computercasepsu', component: ComputerCasePsuComponent
  },
  {
    path: 'cpu', component: CpuComponent
  },
  {
    path: 'cpucore', component: CpuCoreComponent
  },
  {
    path: 'displaycard', component: DisplayCardComponent
  },
  {
    path: 'displaycardgpu', component: DisplayCardGpuComponent
  },
  {
    path: 'displaycardmemory', component: DisplayCardMemoryComponent
  },
  {
    path: 'hdd', component: HDDComponent
  },
  {
    path: 'mainboard', component: MainboardComponent
  },
  {
    path: 'mainboardram', component: MainboardRamComponent
  },
  {
    path: 'monitor', component: MonitorComponent
  },
  {
    path: 'monitorscreen', component: MonitorScreenComponent
  },
  {
    path: 'ram', component: RamComponent
  },
  {
    path: 'ssd', component: SSDComponent
  },
  {
    path: '**', component: NotFoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
