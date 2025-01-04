package service;

import model.Product;
import utils.Logger;

public abstract class StorageNew implements Storage, Logger {

    public abstract void getAllProducts();
}
