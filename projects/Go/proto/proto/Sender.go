// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.1.0.0

package proto

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = fbe.Version

// Fast Binary Encoding proto sender
type Sender struct {
    fbe.Sender
    orderModel *OrderModel
    balanceModel *BalanceModel
    accountModel *AccountModel
}

// Create a new proto sender
func NewSender(buffer *fbe.Buffer) *Sender {
    return &Sender{
        *fbe.NewSender(buffer, false, false),
        NewOrderModel(buffer),
        NewBalanceModel(buffer),
        NewAccountModel(buffer),
    }
}

// Sender models accessors

func (s *Sender) OrderModel() *OrderModel { return s.orderModel }
func (s *Sender) BalanceModel() *BalanceModel { return s.balanceModel }
func (s *Sender) AccountModel() *AccountModel { return s.accountModel }

// Send methods

func (s *Sender) Send(value interface{}) (int, error) {
    switch value.(type) {
    case *Order:
        return s.SendOrder(value.(*Order))
    case *Balance:
        return s.SendBalance(value.(*Balance))
    case *Account:
        return s.SendAccount(value.(*Account))
    }
    return 0, nil
}

func (s *Sender) SendOrder(value *Order) (int, error) {
    // Serialize the value into the FBE stream
    serialized, err := s.orderModel.Serialize(value)
    if serialized <= 0 {
        return 0, errors.New("proto.Order serialization failed")
    }
    if err != nil {
        return 0, err
    }
    if !s.orderModel.Verify() {
        return 0, errors.New("proto.Order validation failed")
    }

    // Log the value
    if s.Logging() {
        message := value.String()
        if err := s.OnSendLogHandler.OnSendLog(message); err != nil {
            return 0, err
        }
    }

    // Send the serialized value
    return s.SendSerialized(serialized)
}

func (s *Sender) SendBalance(value *Balance) (int, error) {
    // Serialize the value into the FBE stream
    serialized, err := s.balanceModel.Serialize(value)
    if serialized <= 0 {
        return 0, errors.New("proto.Balance serialization failed")
    }
    if err != nil {
        return 0, err
    }
    if !s.balanceModel.Verify() {
        return 0, errors.New("proto.Balance validation failed")
    }

    // Log the value
    if s.Logging() {
        message := value.String()
        if err := s.OnSendLogHandler.OnSendLog(message); err != nil {
            return 0, err
        }
    }

    // Send the serialized value
    return s.SendSerialized(serialized)
}

func (s *Sender) SendAccount(value *Account) (int, error) {
    // Serialize the value into the FBE stream
    serialized, err := s.accountModel.Serialize(value)
    if serialized <= 0 {
        return 0, errors.New("proto.Account serialization failed")
    }
    if err != nil {
        return 0, err
    }
    if !s.accountModel.Verify() {
        return 0, errors.New("proto.Account validation failed")
    }

    // Log the value
    if s.Logging() {
        message := value.String()
        if err := s.OnSendLogHandler.OnSendLog(message); err != nil {
            return 0, err
        }
    }

    // Send the serialized value
    return s.SendSerialized(serialized)
}
