package service;

import model.DBuffer;

public interface DBufferManager {
	
	public DBuffer GetCHR(DBuffer bf);
	public void SetValue(DBuffer bf,int value);

}
