import { TestBed } from '@angular/core/testing';

import { TipoStanzaService } from './tipo-stanza.service';

describe('TipoStanzaService', () => {
  let service: TipoStanzaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TipoStanzaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
