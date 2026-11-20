.class public Lim/f$j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lim/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# static fields
.field public static final a:Lim/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lim/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lim/f;-><init>(Lim/g;)V

    sput-object v0, Lim/f$j;->a:Lim/f;

    return-void
.end method

.method public static bridge synthetic a()Lim/f;
    .locals 1

    sget-object v0, Lim/f$j;->a:Lim/f;

    return-object v0
.end method
