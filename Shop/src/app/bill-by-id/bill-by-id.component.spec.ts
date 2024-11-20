import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillByIdComponent } from './bill-by-id.component';

describe('BillByIdComponent', () => {
  let component: BillByIdComponent;
  let fixture: ComponentFixture<BillByIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BillByIdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BillByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
