.class public Luh/f$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# static fields
.field public static final a:Luh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luh/f;

    invoke-direct {v0}, Luh/f;-><init>()V

    sput-object v0, Luh/f$g;->a:Luh/f;

    return-void
.end method

.method public static bridge synthetic a()Luh/f;
    .locals 1

    sget-object v0, Luh/f$g;->a:Luh/f;

    return-object v0
.end method
