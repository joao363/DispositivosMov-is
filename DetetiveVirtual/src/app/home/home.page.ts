import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public edtDist;
  public edtValor;
  public cbContatos;
  public rbTrabalho;
  public rbLocal;
  public resultado;

  constructor() { }

  onVerificarClick() {
    let positivos = 0;

    if (Number(this.edtDist) < 5) {
      positivos++;
    }
    if (Number(this.edtValor) > 1000) {
      positivos++;
    }
    if (this.cbContatos == "mais5") {
      positivos++;
    }
    if (this.rbTrabalho == "sim") {
      positivos++;
    }
    if (this.rbLocal == "sim") {
      positivos++;
    }
    this.resultado = "Você foi considerado ";

    if (positivos < 2) {
      this.resultado += "Inocente";
    } else if (positivos < 3) {
      this.resultado += "Suspeito";
    } else if (positivos < 5) {
      this.resultado += "Cúmplice";
    } else {
      this.resultado += "Assassino";
    }
    this.resultado += "!";


  }

}
