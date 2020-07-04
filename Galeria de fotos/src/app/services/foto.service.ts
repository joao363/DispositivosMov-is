import { Injectable } from '@angular/core';

import { Plugins, CameraResultType, Capacitor, FilesystemDirectory, CameraPhoto, CameraSource, Camera } from '@capacitor/core';

@Injectable({
  providedIn: 'root'
})
export class FotoService {

  constructor() { }

  public async addNovaParaGaleria(){
    //Tira foto
    const foto= await Camera.getPhoto({
      resultType:CameraResultType.Uri,
      source: CameraSource.Camera,
      quality:100
    });
  }
}
