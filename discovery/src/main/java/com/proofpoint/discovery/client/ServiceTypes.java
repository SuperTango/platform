package com.proofpoint.discovery.client;

public final class ServiceTypes
{
    private ServiceTypes()
    {
    }

    public static ServiceType serviceType(String type)
    {
        return new ServiceTypeImpl(type);
    }
}
