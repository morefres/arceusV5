.class public final Lci/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lci/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lci/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lci/k;

    invoke-direct {v0}, Lci/k;-><init>()V

    sput-object v0, Lci/k$a;->a:Lci/k;

    return-void
.end method

.method public static bridge synthetic a()Lci/k;
    .locals 1

    sget-object v0, Lci/k$a;->a:Lci/k;

    return-object v0
.end method
