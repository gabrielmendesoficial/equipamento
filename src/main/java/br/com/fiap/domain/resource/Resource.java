package br.com.fiap.domain.resource;

import jakarta.ws.rs.core.Response;
public interface Resource<T, U> {
    public Response persist(T t);
    public Response findAll();
    public Response findById(U u);
    public Response update(U id, T t);
    public Response delete(U id);
}