package implementations.dm_kernel.GUI.boardEnums;

public enum BeagleboneBlackRevBDig {
    P8_1 (1),
    P8_2 (2),
    P8_3 (3),
    P8_4 (4),
    P8_5 (5),
    P8_6 (6),
    P8_7 (7),
    P8_8 (8),
    P8_9 (9),
    P8_10 (10),
    P8_11 (11),
    P8_12 (12),
    P8_13 (13),
	P8_14 (14),
    P8_15 (15),
    P8_16 (16),
    P8_17 (17),
    P8_18 (18),
    P8_19 (19),
    P8_20 (20),
    P8_21 (21),
    P8_22 (22),
    P8_23 (23),
    P8_24 (24),
    P8_25 (25),
    P8_26 (26),
    P8_27 (27),
	P8_28 (28),
	P8_29 (29),
	P8_30 (30),
    P8_31 (31),
    P8_32 (32),
    P8_33 (33),
    P8_34 (34),
    P8_35 (35),
    P8_36 (36),
    P8_37 (37),
    P8_38 (38),
    P8_39 (39),
    P8_40 (40),
    P8_41 (41),
    P8_42 (42),
    P8_43 (43),
    P8_44 (44),
    P8_45 (45),
    P8_46 (46),
    
	P9_1 (47),
    P9_2 (48),
    P9_3 (49),
    P9_4 (50),
    P9_5 (51),
    P9_6 (52),
    P9_7 (53),
    P9_8 (54),
    P9_9 (55),
    P9_10 (56),
    P9_11 (57),
    P9_12 (58),
    P9_13 (59),
    P9_14 (60),
	P9_15 (61),
    P9_16 (62),
    P9_17 (63),
    P9_18 (64),
    P9_19 (65),
    P9_20 (66),
    P9_21 (67),
    P9_22 (68),
    P9_23 (69),
    P9_24 (70),
    P9_25 (71),
    P9_26 (72),
    P9_27 (73),
    P9_28 (74),
	P9_29 (75),
	P9_30 (76),
	P9_31 (77),
    P9_32 (78),
    P9_34 (80),
    P9_41 (87),
    P9_42 (88),
    P9_43 (89),
    P9_44 (90),
    P9_45 (91),
    P9_46 (92);
    
    private final int value;

    private BeagleboneBlackRevBDig(int value) {
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public int getItemCount(){
        return BeagleboneBlackRevBDig.values().length - 1;
    }
}
