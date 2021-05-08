import { Seller } from "./seller";

export type Sale = {
  id: number;
  visited: number;
  deals: number;
  amount: number;
  date: string;
  sellerDto: Seller;
};

export type SalePage = {
  content?: Sale[];
  last: boolean;
  totalElements: number;
  totalPages: number;
  number: number;
  size?: number;
  first: boolean;
  numberOfElements?: number;
  empty?: boolean;
};

export type SaleSum = {
  sellerName: string;
  soma: number;
};

export type SaleSuccess = {
  sellerName: string;
  visited: number;
  deals: number;
};
