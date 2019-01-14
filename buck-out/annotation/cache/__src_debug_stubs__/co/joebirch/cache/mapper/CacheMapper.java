package co.joebirch.cache.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lco/joebirch/cache/mapper/CacheMapper;", "C", "E", "", "mapFromCached", "type", "(Ljava/lang/Object;)Ljava/lang/Object;", "mapToCached", "src_debug"})
public abstract interface CacheMapper<C extends java.lang.Object, E extends java.lang.Object> {
    
    public abstract E mapFromCached(C type);
    
    public abstract C mapToCached(E type);
}