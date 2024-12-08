/*
 * Copyright (c) 2003, PostgreSQL Global Development Group
 * See the LICENSE file in the project root for more information.
 */

package org.postgresql.core;

public enum TransactionState {

  /**
   * No transaction in progress yet
   */
  IDLE,

  /**
   * Currently inside transaction
   */
  OPEN,

  /**
   * Currently inside the failed transaction. All changes in this transaction would be rolled back.
   */
  FAILED
}
