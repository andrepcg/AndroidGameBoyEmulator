/*
 * Copyright (C) 2015 Pedro Vicente Gomez Sanchez.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.github.pedrovgs.androidgameboyemulator.core.processor;

import com.github.pedrovgs.androidgameboyemulator.core.mmu.MMU;
import com.github.pedrovgs.androidgameboyemulator.core.processor.isa.Instruction;
import com.github.pedrovgs.androidgameboyemulator.core.processor.isa.Load8BitImmPCInto8BitRegister;

public class InstructionsPool {

  private final Instruction[] normalInstructions;
  private final Instruction[] extendedInstructions;

  public InstructionsPool(GBZ80 z80, MMU mmu) {
    normalInstructions = new Instruction[256];
    extendedInstructions = new Instruction[256];
    generateNormalInstructions(z80, mmu);
    generateExtendedInstructions(z80, mmu);
  }

  public Instruction get(int rawInstruction) {
    return null;
  }

  private void generateNormalInstructions(GBZ80 z80, MMU mmu) {

  }

  private void generateExtendedInstructions(GBZ80 z80, MMU mmu) {
    normalInstructions[0x06] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.B);
    normalInstructions[0x0E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.C);
    normalInstructions[0x16] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.D);
    normalInstructions[0x1E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.E);
    normalInstructions[0x26] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.H);
    normalInstructions[0x2E] = new Load8BitImmPCInto8BitRegister(z80, mmu, Register.L);
  }
}
