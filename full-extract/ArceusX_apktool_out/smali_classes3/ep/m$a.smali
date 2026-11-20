.class public final Lep/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lep/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lep/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lep/m;

    invoke-direct {v0}, Lep/m;-><init>()V

    sput-object v0, Lep/m$a;->a:Lep/m;

    return-void
.end method
