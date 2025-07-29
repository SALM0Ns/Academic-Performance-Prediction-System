# Academic Performance Prediction System

**Course**: Data Science and Visualization (Nov 2023 – Apr 2024)  
**Instructor**: Acting Sub Lt. Dr. Chaichana Kulworatit

## Overview

This project focuses on building a rule-based academic performance prediction system using historical academic and behavioral data. The goal is to predict a student's final grade in the **Computer Architecture** course using previous course grades and classroom behavioral attributes. The final logic is implemented in Java and derived from a decision tree model trained and exported using the WEKA machine learning platform.

## Dataset Description

The dataset consists of 72 real student academic records.  
Grade values were grouped into 3 categories:
- `A - B`
- `C+ - D`
- `F - W`

Behavioral attributes included in the prediction model:
- `Skips`: Whether the student skipped class frequently (`yes`/`no`)
- `Work Submit`: Whether assignments were submitted (`yes`/`no`)
- `Note Taking`: Whether the student consistently took notes (`yes`/`no`)
- `Favor in Calculate`: Whether the student liked doing calculations (`yes`/`no`)

## Model and Logic

The decision tree was built using **WEKA's J48 (C4.5)** algorithm with the `unpruned` option enabled for full decision logic extraction. The final tree was manually translated into a Java `if-else` logic structure.

Inputs in the Java program:
- Grades are entered as numbers: `1 = A-B`, `2 = C+-D`, `3 = W-F`
- Behaviors are entered as `yes` or `no`

## Decision Tree 

<img width="1470" height="956" alt="Decision Tree" src="https://github.com/user-attachments/assets/8175b0d8-e2c5-4fa2-8ff2-e253d585f907" />
