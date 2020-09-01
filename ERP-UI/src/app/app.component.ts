import { Component } from '@angular/core';
import { ApiService } from './api.service';
import { DomSanitizer } from '@angular/platform-browser';
import { HeaderComponent } from './header/header/header.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(
    private apiService: ApiService,
    private sanitizer: DomSanitizer
  ) {}
  title = 'best-bin-ui';

  products;
  quantity;
  imageSrc = 'assets/cart.jpg' ;
  imageAlt = 'Add to cart';
  cartProduct = [];

  ngOnInit() {
    this.apiService.getProducts().subscribe(data => {
      console.log(data);
      this.products = data;
    });

  }

  transform(imgValuealue) {
    return this.sanitizer.bypassSecurityTrustResourceUrl(
      'data:image/png;base64,' + imgValuealue
    );
  }
  increment(quantity){
       console.log('quantity:' + quantity);
  }
  addToCart(productId, productCount, productName, productPrice){
    console.log('coming to add to cart method' + productId + 'and' + productCount + 'product name' + productName);
    const cartProductObject: any = {};
    cartProductObject.productId = productCount;
    cartProductObject.quantity = productId;
    cartProductObject.productName = productName;
    cartProductObject.price = productId * productPrice;
    this.cartProduct.push({cartProductObject});
    console.log('manejro' + JSON.stringify(this.cartProduct));
    localStorage.setItem('cartProduct', JSON.stringify(this.cartProduct));
  }

}
