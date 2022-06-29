import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaCamereComponent } from './lista-camere.component';

describe('ListaCamereComponent', () => {
  let component: ListaCamereComponent;
  let fixture: ComponentFixture<ListaCamereComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaCamereComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaCamereComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
