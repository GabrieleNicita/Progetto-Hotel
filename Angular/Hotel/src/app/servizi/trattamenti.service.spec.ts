import { TestBed } from '@angular/core/testing';

import { TrattamentiService } from './trattamenti.service';

describe('TrattamentiService', () => {
  let service: TrattamentiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TrattamentiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
