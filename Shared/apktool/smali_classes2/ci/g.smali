.class public Lci/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lci/f;


# direct methods
.method public static a()Lci/f;
    .locals 1

    sget-object v0, Lci/g;->a:Lci/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lci/h;

    invoke-direct {v0}, Lci/h;-><init>()V

    return-object v0
.end method
