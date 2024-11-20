import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { PurchaseComponent } from './purchase/purchase.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SellProductComponent } from './sell-product/sell-product.component';
import { PurchaseDetailsComponent } from './purchase-details/purchase-details.component';
import { ReturnComponent } from './return/return.component';
import { ReturnDetailsComponent } from './return-details/return-details.component';
import { SellDetailsComponent } from './sell-details/sell-details.component';
import { InventoryDetailsComponent } from './inventory-details/inventory-details.component';
import { BillByIdComponent } from './bill-by-id/bill-by-id.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PurchaseComponent,
    SellProductComponent,
    PurchaseDetailsComponent,
    ReturnComponent,
    ReturnDetailsComponent,
    SellDetailsComponent,
    InventoryDetailsComponent,
    BillByIdComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
