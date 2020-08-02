package com.java.filecontrol.exception;

public class FileStorageException extends RuntimeException {

  public FileStorageException(String s) {
    super(s);
  }

  public FileStorageException(String message, Throwable cause) {
    super(message, cause);
  }


}
