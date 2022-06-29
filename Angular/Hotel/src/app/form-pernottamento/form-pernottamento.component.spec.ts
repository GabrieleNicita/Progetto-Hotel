import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormPernottamentoComponent } from './form-pernottamento.component';

describe('FormPernottamentoComponent', () => {
  let component: FormPernottamentoComponent;
  let fixture: ComponentFixture<FormPernottamentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormPernottamentoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormPernottamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
