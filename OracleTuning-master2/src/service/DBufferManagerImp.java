package service;

import model.DBuffer;

public class DBufferManagerImp implements DBufferManager {


	@Override
	public void SetValue(DBuffer bf,int value) {
	
		bf.setValue(value);
		}

	@Override
	public DBuffer GetCHR(DBuffer bf) {
		
		return bf;
	}
	
	
	

}
