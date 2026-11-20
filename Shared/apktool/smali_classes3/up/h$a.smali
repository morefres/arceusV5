.class public final Lup/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lup/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lup/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lup/h;

    invoke-direct {v0}, Lup/h;-><init>()V

    sput-object v0, Lup/h$a;->a:Lup/h;

    return-void
.end method
