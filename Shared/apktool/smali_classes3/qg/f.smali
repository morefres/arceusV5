.class public final Lqg/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/f$c;,
        Lqg/f$b;,
        Lqg/f$d;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Lmg/d;

.field public final d:Lpg/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZLpg/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg/f;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lqg/f;->b:Z

    new-instance p3, Lmg/d;

    const/4 v0, -0x1

    invoke-direct {p3, p1, p2, v0}, Lmg/d;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;I)V

    iput-object p3, p0, Lqg/f;->c:Lmg/d;

    iput-object p4, p0, Lqg/f;->d:Lpg/a;

    return-void
.end method

.method public static synthetic a(Lqg/f;)Lpg/a;
    .locals 0

    iget-object p0, p0, Lqg/f;->d:Lpg/a;

    return-object p0
.end method

.method public static synthetic b(Lqg/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lqg/f;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic c(Lqg/f;)Lmg/d;
    .locals 0

    iget-object p0, p0, Lqg/f;->c:Lmg/d;

    return-object p0
.end method

.method public static synthetic d(Lqg/f;)Z
    .locals 0

    iget-boolean p0, p0, Lqg/f;->b:Z

    return p0
.end method

.method public static h(Ljava/lang/String;Lpg/c;Ljava/nio/charset/Charset;ZLpg/a;)Lqg/f$c;
    .locals 1

    new-instance v0, Lqg/f;

    invoke-direct {v0, p0, p2, p3, p4}, Lqg/f;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZLpg/a;)V

    invoke-virtual {v0, p1}, Lqg/f;->i(Lpg/c;)Lqg/f$c;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lpg/b;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lqg/f$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v0, 0x2

    if-eq v1, v0, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v0, 0x4

    if-ne v1, v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return v0

    :cond_3
    return v2

    :cond_4
    return v0
.end method

.method public static l(Lqg/f$d;)Lpg/c;
    .locals 1

    sget-object v0, Lqg/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/16 p0, 0x28

    invoke-static {p0}, Lpg/c;->e(I)Lpg/c;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0x1a

    invoke-static {p0}, Lpg/c;->e(I)Lpg/c;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 p0, 0x9

    invoke-static {p0}, Lpg/c;->e(I)Lpg/c;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lpg/c;)Lqg/f$d;
    .locals 2

    invoke-virtual {p0}, Lpg/c;->f()I

    move-result v0

    const/16 v1, 0x9

    if-gt v0, v1, :cond_0

    sget-object p0, Lqg/f$d;->b:Lqg/f$d;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lpg/c;->f()I

    move-result p0

    const/16 v0, 0x1a

    if-gt p0, v0, :cond_1

    sget-object p0, Lqg/f$d;->c:Lqg/f$d;

    return-object p0

    :cond_1
    sget-object p0, Lqg/f$d;->d:Lqg/f$d;

    return-object p0
.end method

.method public static n(C)Z
    .locals 1

    invoke-static {p0}, Lqg/c;->p(I)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static o(C)Z
    .locals 0

    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lqg/c;->s(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static p(C)Z
    .locals 1

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public e([[[Lqg/f$b;ILqg/f$b;)V
    .locals 2

    invoke-static {p3}, Lqg/f$b;->a(Lqg/f$b;)I

    move-result v0

    add-int/2addr p2, v0

    aget-object p1, p1, p2

    invoke-static {p3}, Lqg/f$b;->b(Lqg/f$b;)I

    move-result p2

    aget-object p1, p1, p2

    invoke-static {p3}, Lqg/f$b;->c(Lqg/f$b;)Lpg/b;

    move-result-object p2

    invoke-static {p2}, Lqg/f;->k(Lpg/b;)I

    move-result p2

    aget-object v0, p1, p2

    if-eqz v0, :cond_1

    invoke-static {v0}, Lqg/f$b;->d(Lqg/f$b;)I

    move-result v0

    invoke-static {p3}, Lqg/f$b;->d(Lqg/f$b;)I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    aput-object p3, p1, p2

    return-void
.end method

.method public f(Lpg/c;[[[Lqg/f$b;ILqg/f$b;)V
    .locals 12

    move v3, p3

    iget-object v0, p0, Lqg/f;->c:Lmg/d;

    invoke-virtual {v0}, Lmg/d;->f()I

    move-result v0

    iget-object v2, p0, Lqg/f;->c:Lmg/d;

    invoke-virtual {v2}, Lmg/d;->e()I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v4, p0, Lqg/f;->c:Lmg/d;

    iget-object v5, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v5, p3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5, v2}, Lmg/d;->a(CI)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v0, v2, 0x1

    :goto_0
    move v9, v0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    move v4, v2

    :goto_2
    if-ge v4, v9, :cond_2

    iget-object v0, p0, Lqg/f;->c:Lmg/d;

    iget-object v2, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v2, p3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2, v4}, Lmg/d;->a(CI)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lqg/f$b;

    sget-object v2, Lpg/b;->g:Lpg/b;

    const/4 v5, 0x1

    const/4 v8, 0x0

    move-object v1, p0

    move-object v7, p1

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v8}, Lqg/f$b;-><init>(Lqg/f;Lpg/b;IIILqg/f$b;Lpg/c;Lqg/f$a;)V

    invoke-virtual {p0, p2, p3, v0}, Lqg/f;->e([[[Lqg/f$b;ILqg/f$b;)V

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    sget-object v2, Lpg/b;->i:Lpg/b;

    iget-object v0, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v2, v0}, Lqg/f;->g(Lpg/b;C)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lqg/f$b;

    const/4 v5, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v7, p1

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v8}, Lqg/f$b;-><init>(Lqg/f;Lpg/b;IIILqg/f$b;Lpg/c;Lqg/f$a;)V

    invoke-virtual {p0, p2, p3, v0}, Lqg/f;->e([[[Lqg/f$b;ILqg/f$b;)V

    :cond_3
    iget-object v0, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v9

    sget-object v2, Lpg/b;->e:Lpg/b;

    iget-object v0, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v2, v0}, Lqg/f;->g(Lpg/b;C)Z

    move-result v0

    const/4 v10, 0x2

    const/4 v11, 0x1

    if-eqz v0, :cond_6

    new-instance v0, Lqg/f$b;

    add-int/lit8 v4, v3, 0x1

    if-ge v4, v9, :cond_5

    iget-object v5, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p0, v2, v4}, Lqg/f;->g(Lpg/b;C)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    move v5, v10

    goto :goto_4

    :cond_5
    :goto_3
    move v5, v11

    :goto_4
    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v7, p1

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v8}, Lqg/f$b;-><init>(Lqg/f;Lpg/b;IIILqg/f$b;Lpg/c;Lqg/f$a;)V

    invoke-virtual {p0, p2, p3, v0}, Lqg/f;->e([[[Lqg/f$b;ILqg/f$b;)V

    :cond_6
    sget-object v2, Lpg/b;->d:Lpg/b;

    iget-object v0, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v0, p3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v2, v0}, Lqg/f;->g(Lpg/b;C)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Lqg/f$b;

    add-int/lit8 v4, v3, 0x1

    if-ge v4, v9, :cond_a

    iget-object v5, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p0, v2, v4}, Lqg/f;->g(Lpg/b;C)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_6

    :cond_7
    add-int/lit8 v4, v3, 0x2

    if-ge v4, v9, :cond_9

    iget-object v5, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {p0, v2, v4}, Lqg/f;->g(Lpg/b;C)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    const/4 v10, 0x3

    :cond_9
    :goto_5
    move v5, v10

    goto :goto_7

    :cond_a
    :goto_6
    move v5, v11

    :goto_7
    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v7, p1

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v8}, Lqg/f$b;-><init>(Lqg/f;Lpg/b;IIILqg/f$b;Lpg/c;Lqg/f$a;)V

    invoke-virtual {p0, p2, p3, v0}, Lqg/f;->e([[[Lqg/f$b;ILqg/f$b;)V

    :cond_b
    return-void
.end method

.method public g(Lpg/b;C)Z
    .locals 2

    sget-object v0, Lqg/f$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0

    :cond_1
    invoke-static {p2}, Lqg/f;->p(C)Z

    move-result p1

    return p1

    :cond_2
    invoke-static {p2}, Lqg/f;->n(C)Z

    move-result p1

    return p1

    :cond_3
    invoke-static {p2}, Lqg/f;->o(C)Z

    move-result p1

    return p1
.end method

.method public i(Lpg/c;)Lqg/f$c;
    .locals 7

    if-nez p1, :cond_3

    sget-object p1, Lqg/f$d;->b:Lqg/f$d;

    invoke-static {p1}, Lqg/f;->l(Lqg/f$d;)Lpg/c;

    move-result-object p1

    sget-object v0, Lqg/f$d;->c:Lqg/f$d;

    invoke-static {v0}, Lqg/f;->l(Lqg/f$d;)Lpg/c;

    move-result-object v0

    sget-object v1, Lqg/f$d;->d:Lqg/f$d;

    invoke-static {v1}, Lqg/f;->l(Lqg/f$d;)Lpg/c;

    move-result-object v1

    filled-new-array {p1, v0, v1}, [Lpg/c;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Lqg/f;->j(Lpg/c;)Lqg/f$c;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v2, p1, v2

    invoke-virtual {p0, v2}, Lqg/f;->j(Lpg/c;)Lqg/f$c;

    move-result-object v2

    const/4 v3, 0x2

    aget-object v3, p1, v3

    invoke-virtual {p0, v3}, Lqg/f;->j(Lpg/c;)Lqg/f$c;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lqg/f$c;

    move-result-object v1

    const v2, 0x7fffffff

    const/4 v3, -0x1

    :goto_0
    const/4 v4, 0x3

    if-ge v0, v4, :cond_1

    aget-object v4, v1, v0

    invoke-virtual {v4}, Lqg/f$c;->c()I

    move-result v4

    aget-object v5, p1, v0

    iget-object v6, p0, Lqg/f;->d:Lpg/a;

    invoke-static {v4, v5, v6}, Lqg/c;->v(ILpg/c;Lpg/a;)Z

    move-result v5

    if-eqz v5, :cond_0

    if-ge v4, v2, :cond_0

    move v3, v0

    move v2, v4

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-ltz v3, :cond_2

    aget-object p1, v1, v3

    return-object p1

    :cond_2
    new-instance p1, Llg/c;

    const-string v0, "Data too big for any version"

    invoke-direct {p1, v0}, Llg/c;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {p0, p1}, Lqg/f;->j(Lpg/c;)Lqg/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lqg/f$c;->c()I

    move-result v1

    invoke-virtual {v0}, Lqg/f$c;->e()Lpg/c;

    move-result-object v2

    invoke-static {v2}, Lqg/f;->m(Lpg/c;)Lqg/f$d;

    move-result-object v2

    invoke-static {v2}, Lqg/f;->l(Lqg/f$d;)Lpg/c;

    move-result-object v2

    iget-object v3, p0, Lqg/f;->d:Lpg/a;

    invoke-static {v1, v2, v3}, Lqg/c;->v(ILpg/c;Lpg/a;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    new-instance v0, Llg/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Data too big for version"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Llg/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(Lpg/c;)Lqg/f$c;
    .locals 11

    iget-object v0, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lqg/f;->c:Lmg/d;

    invoke-virtual {v2}, Lmg/d;->f()I

    move-result v2

    const/4 v3, 0x3

    new-array v3, v3, [I

    const/4 v4, 0x2

    const/4 v5, 0x4

    aput v5, v3, v4

    const/4 v4, 0x1

    aput v2, v3, v4

    const/4 v2, 0x0

    aput v1, v3, v2

    const-class v1, Lqg/f$b;

    invoke-static {v1, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[[Lqg/f$b;

    const/4 v3, 0x0

    invoke-virtual {p0, p1, v1, v2, v3}, Lqg/f;->f(Lpg/c;[[[Lqg/f$b;ILqg/f$b;)V

    :goto_0
    if-gt v4, v0, :cond_3

    move v3, v2

    :goto_1
    iget-object v6, p0, Lqg/f;->c:Lmg/d;

    invoke-virtual {v6}, Lmg/d;->f()I

    move-result v6

    if-ge v3, v6, :cond_2

    move v6, v2

    :goto_2
    if-ge v6, v5, :cond_1

    aget-object v7, v1, v4

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    if-eqz v7, :cond_0

    if-ge v4, v0, :cond_0

    invoke-virtual {p0, p1, v1, v4, v7}, Lqg/f;->f(Lpg/c;[[[Lqg/f$b;ILqg/f$b;)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    const v4, 0x7fffffff

    move v7, v2

    move v6, v4

    move v4, v3

    :goto_3
    iget-object v8, p0, Lqg/f;->c:Lmg/d;

    invoke-virtual {v8}, Lmg/d;->f()I

    move-result v8

    if-ge v7, v8, :cond_6

    move v8, v2

    :goto_4
    if-ge v8, v5, :cond_5

    aget-object v9, v1, v0

    aget-object v9, v9, v7

    aget-object v9, v9, v8

    if-eqz v9, :cond_4

    invoke-static {v9}, Lqg/f$b;->d(Lqg/f$b;)I

    move-result v10

    if-ge v10, v6, :cond_4

    invoke-static {v9}, Lqg/f$b;->d(Lqg/f$b;)I

    move-result v6

    move v3, v7

    move v4, v8

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    if-ltz v3, :cond_7

    new-instance v2, Lqg/f$c;

    aget-object v0, v1, v0

    aget-object v0, v0, v3

    aget-object v0, v0, v4

    invoke-direct {v2, p0, p1, v0}, Lqg/f$c;-><init>(Lqg/f;Lpg/c;Lqg/f$b;)V

    return-object v2

    :cond_7
    new-instance p1, Llg/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Internal error: failed to encode \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lqg/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Llg/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method
