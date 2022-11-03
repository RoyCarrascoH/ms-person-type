package com.nttdata.bootcamp.mspersontype.application;

import com.nttdata.bootcamp.mspersontype.model.PersonType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonTypeService {
    public Flux<PersonType> findAll();
    public Mono<PersonType> findById(String idDebitCard);
    public Mono<PersonType> save(PersonType debitCard);
    public Mono<PersonType> update(PersonType debitCard, String idDebitCard);
    public Mono<Void> delete(String idDebitCard);

}
